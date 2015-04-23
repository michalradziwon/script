
  package gen;
  public class Y_Gen156 {
  		@com.google.inject.Inject
  		public Y_Gen156(Y_Gen157 y_gen157){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen157 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  