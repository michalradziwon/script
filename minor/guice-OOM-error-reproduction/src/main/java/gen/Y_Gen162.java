
  package gen;
  public class Y_Gen162 {
  		@com.google.inject.Inject
  		public Y_Gen162(Y_Gen163 y_gen163){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen163 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  