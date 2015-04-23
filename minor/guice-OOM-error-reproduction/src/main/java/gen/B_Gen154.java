
  package gen;
  public class B_Gen154 {
  		@com.google.inject.Inject
  		public B_Gen154(B_Gen155 b_gen155){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen155 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  