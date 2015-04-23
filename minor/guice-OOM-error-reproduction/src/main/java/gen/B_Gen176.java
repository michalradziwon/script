
  package gen;
  public class B_Gen176 {
  		@com.google.inject.Inject
  		public B_Gen176(B_Gen177 b_gen177){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen177 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  