
  package gen;
  public class O_Gen191 {
  		@com.google.inject.Inject
  		public O_Gen191(O_Gen192 o_gen192){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen192 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  