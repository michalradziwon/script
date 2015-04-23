
  package gen;
  public class Q_Gen38 {
  		@com.google.inject.Inject
  		public Q_Gen38(Q_Gen39 q_gen39){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen39 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  