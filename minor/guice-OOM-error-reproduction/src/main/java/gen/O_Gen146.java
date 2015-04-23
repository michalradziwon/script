
  package gen;
  public class O_Gen146 {
  		@com.google.inject.Inject
  		public O_Gen146(O_Gen147 o_gen147){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen147 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  