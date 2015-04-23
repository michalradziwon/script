
  package gen;
  public class Q_Gen30 {
  		@com.google.inject.Inject
  		public Q_Gen30(Q_Gen31 q_gen31){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen31 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  