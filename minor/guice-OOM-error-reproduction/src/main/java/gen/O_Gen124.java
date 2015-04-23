
  package gen;
  public class O_Gen124 {
  		@com.google.inject.Inject
  		public O_Gen124(O_Gen125 o_gen125){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen125 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  