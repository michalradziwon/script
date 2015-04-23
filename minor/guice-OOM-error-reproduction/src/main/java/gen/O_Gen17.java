
  package gen;
  public class O_Gen17 {
  		@com.google.inject.Inject
  		public O_Gen17(O_Gen18 o_gen18){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen18 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  