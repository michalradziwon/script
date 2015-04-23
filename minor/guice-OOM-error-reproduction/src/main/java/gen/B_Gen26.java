
  package gen;
  public class B_Gen26 {
  		@com.google.inject.Inject
  		public B_Gen26(B_Gen27 b_gen27){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen27 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  