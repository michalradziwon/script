
  package gen;
  public class T_Gen21 {
  		@com.google.inject.Inject
  		public T_Gen21(T_Gen22 t_gen22){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen22 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  