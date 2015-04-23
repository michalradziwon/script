
  package gen;
  public class O_Gen95 {
  		@com.google.inject.Inject
  		public O_Gen95(O_Gen96 o_gen96){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen96 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  