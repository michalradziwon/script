
  package gen;
  public class O_Gen52 {
  		@com.google.inject.Inject
  		public O_Gen52(O_Gen53 o_gen53){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen53 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  