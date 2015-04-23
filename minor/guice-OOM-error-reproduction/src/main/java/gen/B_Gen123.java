
  package gen;
  public class B_Gen123 {
  		@com.google.inject.Inject
  		public B_Gen123(B_Gen124 b_gen124){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen124 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  