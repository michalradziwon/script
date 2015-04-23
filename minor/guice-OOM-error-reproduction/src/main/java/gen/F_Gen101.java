
  package gen;
  public class F_Gen101 {
  		@com.google.inject.Inject
  		public F_Gen101(F_Gen102 f_gen102){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen102 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  