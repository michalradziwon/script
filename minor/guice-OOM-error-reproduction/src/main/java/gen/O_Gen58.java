
  package gen;
  public class O_Gen58 {
  		@com.google.inject.Inject
  		public O_Gen58(O_Gen59 o_gen59){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen59 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  