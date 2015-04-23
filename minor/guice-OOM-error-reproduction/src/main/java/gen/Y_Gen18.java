
  package gen;
  public class Y_Gen18 {
  		@com.google.inject.Inject
  		public Y_Gen18(Y_Gen19 y_gen19){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen19 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  