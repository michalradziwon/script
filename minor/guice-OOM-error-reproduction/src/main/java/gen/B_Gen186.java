
  package gen;
  public class B_Gen186 {
  		@com.google.inject.Inject
  		public B_Gen186(B_Gen187 b_gen187){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen187 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  