
  package gen;
  public class T_Gen41 {
  		@com.google.inject.Inject
  		public T_Gen41(T_Gen42 t_gen42){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen42 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  