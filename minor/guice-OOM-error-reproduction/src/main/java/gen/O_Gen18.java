
  package gen;
  public class O_Gen18 {
  		@com.google.inject.Inject
  		public O_Gen18(O_Gen19 o_gen19){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen19 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  