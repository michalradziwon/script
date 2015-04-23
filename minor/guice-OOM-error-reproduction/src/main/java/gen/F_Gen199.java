
  package gen;
  public class F_Gen199 {
  		@com.google.inject.Inject
  		public F_Gen199(F_Gen200 f_gen200){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen200 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  