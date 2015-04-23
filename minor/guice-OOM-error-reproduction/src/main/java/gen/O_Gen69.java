
  package gen;
  public class O_Gen69 {
  		@com.google.inject.Inject
  		public O_Gen69(O_Gen70 o_gen70){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen70 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  