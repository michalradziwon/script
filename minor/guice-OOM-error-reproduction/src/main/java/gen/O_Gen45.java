
  package gen;
  public class O_Gen45 {
  		@com.google.inject.Inject
  		public O_Gen45(O_Gen46 o_gen46){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen46 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  