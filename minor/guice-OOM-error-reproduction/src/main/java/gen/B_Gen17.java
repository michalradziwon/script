
  package gen;
  public class B_Gen17 {
  		@com.google.inject.Inject
  		public B_Gen17(B_Gen18 b_gen18){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen18 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  