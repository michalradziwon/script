
  package gen;
  public class F_Gen187 {
  		@com.google.inject.Inject
  		public F_Gen187(F_Gen188 f_gen188){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen188 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  