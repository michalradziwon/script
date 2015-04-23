
  package gen;
  public class A_Gen186 {
  		@com.google.inject.Inject
  		public A_Gen186(A_Gen187 a_gen187){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen187 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  