
  package gen;
  public class O_Gen71 {
  		@com.google.inject.Inject
  		public O_Gen71(O_Gen72 o_gen72){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen72 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  