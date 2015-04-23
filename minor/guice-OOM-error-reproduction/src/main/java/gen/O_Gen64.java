
  package gen;
  public class O_Gen64 {
  		@com.google.inject.Inject
  		public O_Gen64(O_Gen65 o_gen65){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen65 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  