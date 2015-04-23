
  package gen;
  public class O_Gen56 {
  		@com.google.inject.Inject
  		public O_Gen56(O_Gen57 o_gen57){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen57 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  