
  package gen;
  public class B_Gen25 {
  		@com.google.inject.Inject
  		public B_Gen25(B_Gen26 b_gen26){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen26 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  