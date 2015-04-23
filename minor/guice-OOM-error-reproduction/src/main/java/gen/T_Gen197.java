
  package gen;
  public class T_Gen197 {
  		@com.google.inject.Inject
  		public T_Gen197(T_Gen198 t_gen198){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen198 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  