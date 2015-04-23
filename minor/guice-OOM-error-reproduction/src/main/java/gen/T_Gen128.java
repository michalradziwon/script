
  package gen;
  public class T_Gen128 {
  		@com.google.inject.Inject
  		public T_Gen128(T_Gen129 t_gen129){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen129 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  