
  package gen;
  public class B_Gen157 {
  		@com.google.inject.Inject
  		public B_Gen157(B_Gen158 b_gen158){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen158 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  