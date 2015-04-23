
  package gen;
  public class Y_Gen167 {
  		@com.google.inject.Inject
  		public Y_Gen167(Y_Gen168 y_gen168){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen168 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  