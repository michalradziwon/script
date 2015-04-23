
  package gen;
  public class O_Gen86 {
  		@com.google.inject.Inject
  		public O_Gen86(O_Gen87 o_gen87){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen87 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  