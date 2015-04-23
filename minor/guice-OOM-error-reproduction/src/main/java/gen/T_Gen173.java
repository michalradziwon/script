
  package gen;
  public class T_Gen173 {
  		@com.google.inject.Inject
  		public T_Gen173(T_Gen174 t_gen174){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen174 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  