
  package gen;
  public class Y_Gen170 {
  		@com.google.inject.Inject
  		public Y_Gen170(Y_Gen171 y_gen171){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen171 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  