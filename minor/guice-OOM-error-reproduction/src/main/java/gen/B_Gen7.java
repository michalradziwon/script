
  package gen;
  public class B_Gen7 {
  		@com.google.inject.Inject
  		public B_Gen7(B_Gen8 b_gen8){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen8 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  