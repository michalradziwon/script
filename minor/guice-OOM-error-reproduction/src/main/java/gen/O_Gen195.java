
  package gen;
  public class O_Gen195 {
  		@com.google.inject.Inject
  		public O_Gen195(O_Gen196 o_gen196){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen196 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  