
  package gen;
  public class O_Gen26 {
  		@com.google.inject.Inject
  		public O_Gen26(O_Gen27 o_gen27){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen27 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  