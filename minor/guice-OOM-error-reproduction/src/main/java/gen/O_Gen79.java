
  package gen;
  public class O_Gen79 {
  		@com.google.inject.Inject
  		public O_Gen79(O_Gen80 o_gen80){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen80 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  