
  package gen;
  public class Q_Gen66 {
  		@com.google.inject.Inject
  		public Q_Gen66(Q_Gen67 q_gen67){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen67 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  