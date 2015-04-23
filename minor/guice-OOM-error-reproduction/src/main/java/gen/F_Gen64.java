
  package gen;
  public class F_Gen64 {
  		@com.google.inject.Inject
  		public F_Gen64(F_Gen65 f_gen65){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen65 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  