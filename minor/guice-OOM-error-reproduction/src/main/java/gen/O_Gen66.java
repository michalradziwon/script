
  package gen;
  public class O_Gen66 {
  		@com.google.inject.Inject
  		public O_Gen66(O_Gen67 o_gen67){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen67 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  