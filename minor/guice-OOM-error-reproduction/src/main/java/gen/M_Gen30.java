
  package gen;
  public class M_Gen30 {
  		@com.google.inject.Inject
  		public M_Gen30(M_Gen31 m_gen31){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen31 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  