
  package gen;
  public class O_Gen99 {
  		@com.google.inject.Inject
  		public O_Gen99(O_Gen100 o_gen100){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen100 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  