
  package gen;
  public class B_Gen113 {
  		@com.google.inject.Inject
  		public B_Gen113(B_Gen114 b_gen114){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen114 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  