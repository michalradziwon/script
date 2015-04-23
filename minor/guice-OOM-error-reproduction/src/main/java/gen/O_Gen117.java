
  package gen;
  public class O_Gen117 {
  		@com.google.inject.Inject
  		public O_Gen117(O_Gen118 o_gen118){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen118 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  