
  package gen;
  public class F_Gen173 {
  		@com.google.inject.Inject
  		public F_Gen173(F_Gen174 f_gen174){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen174 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  