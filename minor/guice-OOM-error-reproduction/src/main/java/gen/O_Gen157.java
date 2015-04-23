
  package gen;
  public class O_Gen157 {
  		@com.google.inject.Inject
  		public O_Gen157(O_Gen158 o_gen158){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen158 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  