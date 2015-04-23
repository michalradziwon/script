
  package gen;
  public class B_Gen99 {
  		@com.google.inject.Inject
  		public B_Gen99(B_Gen100 b_gen100){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen100 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  