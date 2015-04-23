
  package gen;
  public class B_Gen30 {
  		@com.google.inject.Inject
  		public B_Gen30(B_Gen31 b_gen31){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen31 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  