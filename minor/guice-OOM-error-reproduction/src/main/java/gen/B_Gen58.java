
  package gen;
  public class B_Gen58 {
  		@com.google.inject.Inject
  		public B_Gen58(B_Gen59 b_gen59){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen59 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  