
  package gen;
  public class Y_Gen146 {
  		@com.google.inject.Inject
  		public Y_Gen146(Y_Gen147 y_gen147){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen147 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  